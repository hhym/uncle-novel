<p align="center">
	<a href="https://github.com/unclezs/NovelHarvester/blob/master/LICENSE">
		<img src="https://gitee.com/unclezs/image-blog/raw/master/20210103184920.png"
			 alt="logo" width="500" style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888; margin-top:10px">
	</a>
</p>

<p align="center">
	<a href="https://github.com/unclezs/NovelHarvester/blob/master/LICENSE">
		<img src="https://img.shields.io/github/license/unclezs/NovelHarvester"
			 alt="License">
	</a>
	<img src="https://img.shields.io/github/downloads/unclezs/NovelHarvester/total"/>
	<img src="https://img.shields.io/github/v/release/unclezs/NovelHarvester"/>
	<img src="https://img.shields.io/badge/jdk-8.221-green"/>
	<img src="https://img.shields.io/badge/platform-win linux mac-green"/>
	<a href="https://github.com/unclezs/NovelHarvester">
		<img src="https://img.shields.io/github/workflow/status/unclezs/NovelHarvester/Java%20CI%20with%20Maven"
			 alt="Build Status">
	</a>
</p>


## 前世今生

这个App本来是最初只为了满足我个人的小说下载诉求，因为以前下载小说总是苦于无法找到途径，都是慢慢百度找提供TXT下载的网站，所以就想做一个方便一点的工具，能够想下载什么就下载什么。也就用到了目录解析来实现了。

最初以第一个版本只有一个目录解析的功能，发布到了吾爱破解论坛的原创区，被很多网友提了意见，逐渐有时间就迭代一次，也到了4.0版本。拥有了更加丰富的功能，虽然我自己几乎还是只用目录解析下载TXT，哈哈。

## 功能简介

- 目录解析，提供文字小说网站的小说目录地址，进行解析下载
- 在线、离线小说阅读，提供PC端的小说阅读功能
- 多种小说格式下载TXT，MOBI，EPUB
- 有声小说下载及在线听
- 文本朗读，不过只支持windows的引擎，也能合成语音
- 主题、老板键、国际化。。。
- 更多功能下载体验....

### 文本小说

软件支持文本小说的搜索、下载、解析目录、合成语音、在线阅读等功能

### 搜索文本小说

内置几个书源搜索、可以自行添加。搜索也只是根据规则找到目录地址，然后在通过目录解析进行下载的

<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105085738.png"  width="600" style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888;"/>

### 解析目录

任意一个网站的小说目录地址，填入如果检测到剪贴板有会自动导入，点击解析目录则会解析出来章节目录，如果解析成功之后可以加入书架在线阅读，也可以直接下载

双击目录章节列表地方查看章节内容，如果发现有广告则再解析配置中添加广告字符串即可去除。如果没有匹配到章节内容可以换个浏览器打开，如果还是没有，则开启模拟浏览器，再进行上诉操作

<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105085942.png" width="600"  style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888;"/>
<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105090004.png"  width="600" style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888; margin-top:10px"/>

### 在线阅读

### 文本小说书架

按照自己想法解析完成之后，添加到书架即可在线阅读，可以导入本地TXT，可以拖入。 点击进行阅读，也可以右键拉取最新章节列表。缓存式阅读，阅读后自动缓存到本地，移除书架时，清理缓存文件。

<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105090024.png" width="600"  style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888;"/>

### 小说阅读器

滚动方式阅读，上下章节拼接，沉浸状态栏模式，让阅读体验更佳，支持常规的阅读器设置。使用windows语音引擎朗读

<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105090047.png"  width="600" style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888;"/>
<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105090055.png"  width="600" style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888;margin-top:10px"/>

### 有声小说搜索

搜索有声小说然后获取到目录，**首先检测音频是否失效** 然后再进行后续操作，加入书架，添加下载。

<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105090104.png"  width="600" style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888;"/>
<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105090117.png"  width="600" style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888;margin-top:10px"/>

### 有声小说书架

可以加入书架后听，方便快捷，也能记录位置。

<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105090125.png"  width="600" style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888;"/>

### 一些配置

再下载时候可以配置下载的线程数量，线程数量越多当然下载会快，但是可能会导致别人服务器受不了，所以不推荐太多线程。而且线程多了之后很可能会出现封IP导致下载失败的情况出现。

<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105090136.png"  width="600" style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888;"/>
<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105090147.png"  width="600" style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888;margin-top:10px"/>

## 下载地址

如果您觉得不错，希望能点个Star！

- QQ群文件：774716671
- 欢迎关注公众号【书虫无书荒】获取最新资讯及使用教程，不过没时间搞哈哈

## 喝杯咖啡~

<img src="https://gitee.com/unclezs/image-blog/raw/master/20210105090216.jpeg" style="border: #888 solid 1px;box-shadow: 10px 10px 5px #888888;"/>
