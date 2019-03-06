package com.qingyunxuetang.qinghealth;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NewsDetailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().print("{\n" +
                "  \"title\":\"马云1995神预言及一张图看懂互联网产品架构\",\n" +
                "  \"brief\":\"最近看到马云在1995年接受浙江卫视采访时的一段旧视频，深深为马云的先见之明折服，感觉马云不会是穿越回去的吧。\",\n" +
                "  \"author\":\"青云\",\n" +
                "  \"createTime\":\"2018-12-20\",\n" +
                "  \"content\":\"最近看到马云在1995年接受浙江卫视采访时的一段旧视频，深深为马云的先见之明折服，感觉马云不会是穿越回去的吧。95年的时候，马云说21世纪是互联网的世界，或许有很多人会不屑一顾，或不知所云，现在来到了21世纪以及过去了18年，互联网正以前所未有的趋势改变着我们的生活，21世纪是互联网的世纪已经成为现实，那么生活在互联网世纪的我们，真的了解互联网吗，你知识互联网的基本架构是什么吗？image.png要明白什么是互联网架构，首先要知道什么是架构呢，架构是一款软件产品的草图，是构建一款软件的基础。软件架构描述的是构成系统的组件，以及各个组件之间的连接和通讯。架构如建筑物的蓝图；架构如生物的骨架；架构如书籍的目录。上面说了，架构描述的是构成系统的组件。那么构成互联网产品的组件有哪些呢？主要有三个部分，客户端、互联网、服务器端。举个栗子：以微信和百度为例像我们平常使用的微信，安装在大家手机里的app就是架构中的Client，联系你和你的好友的纽带就是微信遍布全球的服务器，也就是Server，而微信app和微信服务器是通过互联网连接的。还有我们平常用的百度等搜索引擎，大家打开浏览器，打开的百度网页，就是架构中的客户端，输入关键字，点击搜索后，客户端就会发送请求到百度遍布全球的服务器，搜索到结果后，再通过浏览器以网页的形式展示给我们，而联系百度网页和服务器的则是互联网。一张图看懂互联网产品架构CS/BS架构图如上图，左侧的C/S客户端和Web客户端就是我们平常用的智能手机、电脑；右侧的CS通讯服务器、网站Web服务器、数据库服务器就是微信中转我们消息、百度等处理我们请求的服务器；中间的Internet就是我们平常说的互联网，中间的Intranet就是我们平常在学校用的校园网、在公司用的公司网、在家里连的wifi路由器等等。通过中间的互联网，我们就可以和服务器通讯，然后通过服务器的中转和分发，我们就可以和朋友聊天，就可以看电影、看新闻了。关于互联网产品的架构，其实还有太多太多值得深入学习的，不过所有的架构，它的雏形都是本文提到的客户端-互联网-服务器。\"\n" +
                "}");
        response.getWriter().flush();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
