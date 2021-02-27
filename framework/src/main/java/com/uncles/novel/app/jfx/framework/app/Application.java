package com.uncles.novel.app.jfx.framework.app;

import com.sun.javafx.css.StyleManager;
import com.uncles.novel.app.jfx.framework.lifecycle.LifeCycle;
import com.uncles.novel.app.jfx.framework.util.ResourceUtils;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

/**
 * @author blog.unclezs.com
 * @since 2021/02/26 10:50
 */
public abstract class Application extends javafx.application.Application implements LifeCycle {
    public static final int INIT_WIDTH = 900;
    public static final int INIT_HEIGHT = 600;
    private Stage stage;
    private Scene scene;
    private Parent view;
    private static final String APP_STYLE = ResourceUtils.loadCss("application.css").toExternalForm();

    static {
        Application.setUserAgentStylesheet(APP_STYLE);
        // 设置主题
        List<String> theme = Arrays.asList("com/sun/javafx/scene/control/skin/modena/modena.css", APP_STYLE);
        StyleManager.getInstance().setUserAgentStylesheets(theme);
    }

    @Override
    public void init() throws Exception {
    }

    @Override
    public final void start(Stage stage) throws Exception {
        this.stage = stage;
        this.view = getView();
        this.scene = new Scene(view, INIT_WIDTH, INIT_HEIGHT);
        this.stage.setScene(scene);
        onCreated();
        this.stage.show();
        onShow();
        this.stage.onHiddenProperty().addListener(e -> {
            onHidden();
        });
    }

    /**
     * 获取试图
     *
     * @return 视图
     * @throws Exception 异常
     */
    public abstract Parent getView() throws Exception;

    public Stage getStage() {
        return stage;
    }

    public Scene getScene() {
        return scene;
    }
}
