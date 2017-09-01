<h1>
	<span style="color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:2.13em; font-weight:100"></span>
	<pre name="code" class="html"></pre>
	安装 Kotlin Plugin
</h1>
<div>
	<span style="color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-weight:100; font-size:15px">&nbsp;打开 android studio 中的 setting 选项 中 plugins 搜索 Kotlin 安装重启即可</span>
</div>
<div>
	<span style="color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-weight:100; font-size:15px"><img src="http://img.blog.csdn.net/20170901162702981?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvU2hhel8=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center" alt="" /></span>
</div>
<div>
	<span style="color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-weight:100; font-size:15px"></span>
</div>
<div>
	<span style="color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-weight:100"></span>
	<h1 style="font-size:15px">
		<span style="color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:2.13em; font-weight:100">创建一个项目</span>
	</h1>
	<div style="font-size:15px">
		<span style="color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:2.13em; font-weight:100"><img src="http://img.blog.csdn.net/20170901162912557?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvU2hhel8=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center" alt="" /></span>
	</div>
	<div style="font-size:15px">
	</div>
	<div style="font-size:15px">
		从上图所示一个普通的安卓项目
	</div>
	<div style="font-size:15px">
	</div>
	<div style="font-size:15px">
		<h1 style="color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;">
			<span style="font-size:2.13em; font-weight:100">将java文件转换为kt文件</span>
		</h1>
		<div>
			<span style="font-size:2.13em; font-weight:100"><span style="color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">接下来，在左侧工程目录面板中选中MainActivity文件，然后再IDE顶部的code菜单中选择“Convert&nbsp;</span><a target="_blank" href="http://lib.csdn.net/base/java" class="replace_word" title="Java 知识库" style="color:rgb(223,52,52); text-decoration:none; font-family:&quot;microsoft yahei&quot;; font-size:15px; font-weight:bold">Java&nbsp;</a><span style="color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">File to Kotlin File”操作。</span></span>
		</div>
		<div>
			<span style="font-size:2.13em; font-weight:100"><span style="color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px"><img src="http://img.blog.csdn.net/20170901163224389?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvU2hhel8=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center" alt="" /></span></span>
		</div>
	</div>
	<div style="font-size:15px">
		之后java文件会转换为kt文件 &nbsp;内容变化如下
	</div>
	<div style="font-size:15px">
		<img src="http://img.blog.csdn.net/20170901163425111?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvU2hhel8=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center" alt="" />
	</div>
	<div>
		<p style="font-size:15px; margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;">
			这就是一个用Kotlin语法编写的Activity类，同时IDE也弹出了一个提示，在右上角给出了一个“Configure”的操作选择，这是Kotlin Plugin提供修改Android 项目的Gradle配置文件的提示。选择后会弹出如下提示框：
		</p>
		<p style="font-size:15px; margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;">
			<img src="http://img.blog.csdn.net/20160322104418602" alt="这里写图片描述" title="" style="border:none; max-width:100%" />
		</p>
		<h2 id="kotlin-编译配置" style="font-size:2.13em; margin:0.8em 0px; padding:0px; font-weight:100; line-height:1.3em; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;">
			<a target="_blank" name="t3" style="color:rgb(79,161,219)"></a><span style="font-size:2.13em">Kotlin 编译配置</span>
		</h2>
		<p style="font-size:15px; margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;">
			选择OK后，Kotlin Plugin会在你项目的app 目录下的gradle文件中自动添加一些内容如下，都是一些Kotlin编译项目需要的配置：
		</p>
		<p style="font-size:15px; margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;">
			<img src="http://img.blog.csdn.net/20160322113106273" alt="这里写图片描述" title="" style="border:none; max-width:100%" />
		</p>
		<p style="font-size:15px; margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;">
			注意一下，其中有一句“apply plugin: ‘kotlin-android-extensions’”是我手动添加进去的，这一句的用途稍后会解释给大家。
		</p>
		<h2 id="kotlin-编译配置" style="font-size:2.13em; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; margin:0.8em 0px; padding:0px; font-weight:100; line-height:1.3em">
			<span style="font-size:2.13em">Kotlin 的简单体验</span>
		</h2>
		<div style="font-size:15px">
		</div>
		<div style="font-size:15px">
			<p style="margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">
				既然Kotlin的编译环境配置好了，那我们就可以开始运行程序吧。
			</p>
			<p style="margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">
				这个第一个编写的Kotlin程序 就叫做KotlinTest了
			</p>
			<p style="margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">
				首先在activity_main.xml 添加一个 TextView 和 Button 用于接下来的测试 代码如下
			</p>
			<p style="margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">
			</p>
			<pre style="background-color:#272822; color:#f8f8f2; font-family:'宋体'; font-size:12.0pt"><span style="font-style:italic">&lt;?</span><span style="color:#66d9ef"><em>xml version=</em></span><span style="color:#e6db74">&quot;1.0&quot; </span><span style="color:#66d9ef"><em>encoding=</em></span><span style="color:#e6db74">&quot;utf-8&quot;</span><span style="font-style:italic">?&gt;
</span><span style="color:#f9faf4">&lt;</span><span style="color:#f92672">LinearLayout </span><span style="color:#66d9ef"><em>xmlns:android=</em></span><span style="color:#e6db74">&quot;http://schemas.android.com/apk/res/android&quot;
</span><span style="color:#e6db74">    </span><span style="color:#66d9ef"><em>xmlns:app=</em></span><span style="color:#e6db74">&quot;http://schemas.android.com/apk/res-auto&quot;
</span><span style="color:#e6db74">    </span><span style="color:#66d9ef"><em>xmlns:tools=</em></span><span style="color:#e6db74">&quot;http://schemas.android.com/tools&quot;
</span><span style="color:#e6db74">    </span><span style="color:#66d9ef"><em>android:layout_width=</em></span><span style="color:#e6db74">&quot;match_parent&quot;
</span><span style="color:#e6db74">    </span><span style="color:#66d9ef"><em>android:layout_height=</em></span><span style="color:#e6db74">&quot;match_parent&quot;
</span><span style="color:#e6db74">    </span><span style="color:#66d9ef"><em>tools:context=</em></span><span style="color:#e6db74">&quot;com.shaz.xue.kotlintest.MainActivity&quot;</span><span style="color:#f9faf4">&gt;
</span><span style="color:#f9faf4">
</span><span style="color:#f9faf4">    &lt;</span><span style="color:#f92672">TextView
</span><span style="color:#f92672">        </span><span style="color:#66d9ef"><em>android:layout_width=</em></span><span style="color:#e6db74">&quot;wrap_content&quot;
</span><span style="color:#e6db74">        </span><span style="color:#66d9ef"><em>android:layout_height=</em></span><span style="color:#e6db74">&quot;wrap_content&quot;
</span><span style="color:#e6db74">        </span><span style="color:#66d9ef"><em>android:id=</em></span><span style="color:#e6db74">&quot;@+id/tv_kotlin&quot;</span><span style="color:#f9faf4">/&gt;
</span><span style="color:#f9faf4">
</span><span style="color:#f9faf4">    &lt;</span><span style="color:#f92672">Button
</span><span style="color:#f92672">        </span><span style="color:#66d9ef"><em>android:layout_width=</em></span><span style="color:#e6db74">&quot;wrap_content&quot;
</span><span style="color:#e6db74">        </span><span style="color:#66d9ef"><em>android:layout_height=</em></span><span style="color:#e6db74">&quot;wrap_content&quot;
</span><span style="color:#e6db74">        </span><span style="color:#66d9ef"><em>android:id=</em></span><span style="color:#e6db74">&quot;@+id/btn_kotlin&quot;</span><span style="color:#f9faf4">/&gt;
</span><span style="color:#f9faf4">
</span></pre>
			<br />
			
		</div>
		<div style="font-size:15px">
			<br />
			
		</div>
		<div style="font-size:15px">
			接下来编写MainActivity中的代码
		</div>
		<div style="font-size:15px">
			<br />
			
		</div>
		<div style="font-size:15px">
			<pre style="background-color:#272822; color:#f8f8f2; font-family:'宋体'; font-size:12.0pt"><span style="color:#f92672">import </span>android<span style="color:#f92672">.</span>os<span style="color:#f92672">.</span><span style="color:#66d9ef"><em>Bundle
</em></span><span style="color:#f92672">import </span>android<span style="color:#f92672">.</span>support<span style="color:#f92672">.</span>v7<span style="color:#f92672">.</span>app<span style="color:#f92672">.</span><span style="color:#66d9ef"><em>AppCompatActivity
</em></span><span style="color:#f92672">import </span>kotlinx<span style="color:#f92672">.</span>android<span style="color:#f92672">.</span>synthetic<span style="color:#f92672">.</span>main<span style="color:#f92672">.</span>activity_main<span style="color:#f92672">.*
</span><span style="color:#f92672">
</span><span style="color:#f92672">class </span><span style="color:#66d9ef"><em>MainActivity </em></span>: <span style="color:#a7ec21">AppCompatActivity</span><span style="color:#f9faf4">() {
</span><span style="color:#f9faf4">
</span><span style="color:#f9faf4">    </span><span style="color:#f92672">override fun </span><span style="color:#a7ec21">onCreate</span><span style="color:#f9faf4">(</span><span style="color:#66d9ef"><em>savedInstanceState</em></span>: <span style="color:#66d9ef"><em>Bundle</em></span>?<span style="color:#f9faf4">) {
</span><span style="color:#f9faf4">        </span><span style="color:#f92672">super.</span><span style="color:#a7ec21">onCreate</span><span style="color:#f9faf4">(</span><span style="color:#66d9ef"><em>savedInstanceState</em></span><span style="color:#f9faf4">)
</span><span style="color:#f9faf4">        </span><span style="color:#a7ec21">setContentView</span><span style="color:#f9faf4">(</span><span style="color:#66d9ef"><em>R</em></span><span style="color:#f92672">.</span><span style="color:#66d9ef"><em>layout</em></span><span style="color:#f92672">.</span>activity_main<span style="color:#f9faf4">)
</span><span style="color:#f9faf4">
</span><span style="color:#f9faf4">        </span>tv_kotlin<span style="color:#f92672">.</span>text <span style="color:#f92672">=</span><span style="color:#e6db74">&quot;Kotlin赋值成功&quot;
</span><span style="color:#e6db74">
</span><span style="color:#e6db74">        </span>btn_kotlin<span style="color:#f92672">.</span>text <span style="color:#f92672">= </span><span style="color:#e6db74">&quot;点击测试&quot;
</span><span style="color:#e6db74">        </span>btn_kotlin<span style="color:#f92672">.</span><span style="color:#a7ec21">setOnClickListener</span><span style="color:#f9faf4"><strong>{
</strong></span><span style="color:#f9faf4"><strong>            </strong></span><span style="color:#a7ec21">toast</span><span style="color:#f9faf4">(</span><span style="color:#e6db74">&quot;测试成功&quot;</span><span style="color:#f9faf4">)
</span><span style="color:#f9faf4">        </span><span style="color:#f9faf4"><strong>}
</strong></span><span style="color:#f9faf4"><strong>    </strong></span><span style="color:#f9faf4">}
</span><span style="color:#f9faf4">}</span></pre>
			<br />
			
		</div>
		<div style="font-size:15px">
			<p style="margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">
			</p>
			<h2 id="函数扩展" style="margin:0.8em 0px; padding:0px; font-weight:100; line-height:1.3em; font-size:2.13em; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;">
				函数扩展
			</h2>
			<p>
			</p>
			<p style="margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">
				函数扩展可以让你对任意类进行扩展，而不用继承等等复杂的操作。&nbsp;<br style="" />
				举个栗子！拿Toast来说，到处都可以用到，我们新建个kt文件，叫做ext&nbsp;<br style="" />
				里面写上如下代码：
			</p>
			<pre style="background-color:#272822; color:#f8f8f2; font-family:'宋体'; font-size:12.0pt"><span style="color:#f92672">fun </span><span style="color:#66d9ef"><em>Context</em></span><span style="color:#f92672">.</span><span style="color:#a7ec21">toast</span><span style="color:#f9faf4">(</span><span style="color:#66d9ef"><em>message</em></span>: <span style="color:#66d9ef"><em>String</em></span><span style="color:#f92672">, </span><span style="color:#66d9ef"><em>length </em></span>:<span style="color:#66d9ef"><em>Int </em></span><span style="color:#f92672">= </span><span style="color:#66d9ef"><em>Toast</em></span><span style="color:#f92672">.</span>LENGTH_SHORT<span style="color:#f9faf4">){
</span><span style="color:#f9faf4">    </span><span style="color:#66d9ef"><em>Toast</em></span><span style="color:#f92672">.</span><span style="color:#a7ec21">makeText</span><span style="color:#f9faf4">(</span><span style="color:#f92672">this,</span><span style="color:#66d9ef"><em>message</em></span><span style="color:#f92672">,</span><span style="color:#66d9ef"><em>length</em></span><span style="color:#f9faf4">)</span><span style="color:#f92672">.</span><span style="color:#a7ec21">show</span><span style="color:#f9faf4">()
</span><span style="color:#f9faf4">}</span></pre>
			<br />
			
		</div>
		<p style="margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">
			加了这句话，就可以在所有Context类型中使用toast这个函数了。
		</p>
		<p style="margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">
			具体的语法是 fun + 类型.函数(参数)
		</p>
		<p style="margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">
			这断代码可以写在任意可以编译到的文件中，直的注意的是，如果写在了class内部，则是局部生效。
		</p>
		<p style="margin-top:0px; margin-bottom:1.1em; padding-top:0px; padding-bottom:0px; color:rgb(63,63,63); font-family:&quot;microsoft yahei&quot;; font-size:15px">
			来看一下第二个参数，可以给默认值，如果参数不传，则自动调用默认值，这方便了什么？大家想想，没错！！ 就是重载！！！ 总之最终简化版点击按钮相应弹toast，代码就是一行！
		</p>
		<pre style="background-color:rgb(39,40,34); color:rgb(248,248,242); font-family:宋体; font-size:12pt">btn_kotlin<span style="color:rgb(249,38,114)">.</span><span style="color:rgb(167,236,33)">setOnClickListener</span><span style="color:rgb(249,250,244)"><strong>{
</strong></span><span style="color:rgb(249,250,244)"><strong>            </strong></span><span style="color:rgb(167,236,33)">toast</span><span style="color:rgb(249,250,244)">(</span><span style="color:rgb(230,219,116)">&quot;测试成功&quot;</span><span style="color:rgb(249,250,244)">)
</span><span style="color:rgb(249,250,244)">        </span><span style="color:rgb(249,250,244)"><strong>}</strong></span></pre>
		<br />
		
	</div>
	<div style="font-size:15px">
		<br />
		
	</div>
</div>
