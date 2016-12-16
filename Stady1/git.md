#git的基本用法
	1，创建本地库在cmd或者终端下输入以下命令行：
	git config --global user.name trigkit4
	git config --global user.email 345823102@qq.com
	当然，这是我的账户信息，你需要将他们换成你自己的。
	创建本地ssh
	这是一种传输代码的方法，速度快又安全。SSH 是目前较可靠，专为远程登录会话和其他网络服务提供安全性的协议。
	在终端或cmd输入以下命令行：
	ssh-keygen -t rsa -C "345823102@qq.com"
	当然，邮箱依然换成你注册github时所用的邮箱。
	
	路径选择 : 使用该命令之后, 会出现提示选择ssh-key生成路径, 这里直接点回车默认即可, 生成的ssh-key在默认路径中;
	密码确认 : 这里我们不使用密码进行登录, 用密码太麻烦;就一路回车下去
	将ssh配置到GitHub中
	在mac os X 下前往文件夹，/Users/自己电脑用户名/.ssh。
	windows应该是（C:\Documents and Settings\Administrator\.ssh （或者 C:\Users\自己电脑用户名\.ssh）中）。
		然后用记事本打开id_rsa.pub，将里面的全部代码复制到github的SSH中。
	id_rsa.pub 文件内容 :
	ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDS0qLtpontavr43AQntX4oBOsg2R3QlWubMYvfgJsIDX6NWd5RaIDLBLEMwIFLDcpvpQKvk5S/bTy4vTuWqeY6fkQ/tZBKksQn1WuYDcSfjLF8BuPMfdkboTh9NaKESKnsiWdranEVbmB5vOAHm8T+HFGdzG7Tz4ygzCnTwvdpBYrd/4jgeazws2d7CuMeuyb+FxdDTQy9YmJJm+82ypfR//bLyzRJo3SYadnPO3VdOAZCO1Isky+p/0nNN/obC4t2y2+oHBAqJV9h37f9S8UShgDmZoVLicRi4poni0i70xj+t/hnOsT8fmEc+vM9USyN+ndawz2oWjikKgln1jOB 345823102@qq.com
	登陆github网站，点击Settings——SSH keys——点击右侧的Add SSH key ，

	
	验证是否配置成功 :
	复制如下代码:
	ssh -T git@github.com
	然后出现如下信息：
	Warning: Permanently added the RSA host key for IP address '192.30.252.131' to the list of known hosts.
	
	Hi hawx1993! You've successfully authenticated, but GitHub does not provide shell access.
	验证时可能让你输入YES，当出现以上信息时，说明配置成功，可以连接上GitHub;
		第一步，在本地创建一个版本库，代码如下：
	$ mkdir test   #test是你的文件夹的名字
	$ cd test     #进入test所在目录
	$ pwd        #pwd命令用于显示当前目录    
	/Users/trigkit4/test #这是在我的电脑上的目录
	第二步，通过git init命令把这个目录变成Git可以管理的仓库：
	$ git init
	然后会输出以下信息：
	Initialized empty Git repository in /Users/trigkit4/banner/.git/
	这里的.git目录是Git用来跟踪管理版本库的，默认是隐藏的。
	第三部，接着，在github上创建一个你自己的new repository，然后下一步，
	mkdir test  
	cd test   
	git init    
	# initialize your git repository  
	touch README  
	# create a file named README  
	git add README    
	# add README to cache  
	git commit -m 'first commit'  
	# commit your files to local repository  
	然后我们将本地的文件传送至github中，使用如下命令：
	git remote add origin https://github.com/yourname/test.git  
	git push -u origin master  
	从现有仓库克隆
	git clone git://github.com/yourname/test.git
	git clone git://github.com/yourname/grit.git mypro#克隆到自定义文件夹
#遇见错误
	如果输入$ git remote add origin git@github.com:djqiang（github帐号名）/gitdemo（项目名）.git 
    提示出错信息：fatal: remote origin already exists.
    解决办法如下：
    1、先输入$ git remote rm origin
    2、再输入$ git remote add origin git@github.com:djqiang/gitdemo.git 就不会报错了！   

#git 代码解释
# 初始化仓库，在需要使用git来管理的项目目录中，使用此命令来初始化仓库。
$ git init
# 查看仓库的状态.
	$ git status
	向暂存区中添加文件
	$ git add
	一次性加入当前目录中的全部文件
	$ git add .
	使用互动模式来提交文件
	$ git add –i 
	保存仓库的历史纪录
	$ git commit -m "提交信息简介" 
	查看工作树与暂存区的差别
	$ git diff
	查看工作树与最新提交的差别
	$ git diff HEAD
	查看提交日志
	$ git log
	只显示提交信息的第一行
	$ git log --pretty=short
	只显示指定目录、文件的日志
	$ git log 文件名
	显示指定文件的改动，查看提交所带来的影响
	$ git log -p 文件名
	显示分支览表，将会列出当前所有分支，左侧标有*表示当前所在分支
	$ git branch
	创建、切换分支，若分支存在，则直接切换，若分支不存在则创建并切换，
	$ git checkout –b 分支名称
	等同于：
	$ git branch 分支名称
	$ git checkout 分支名称
	 合并分支
	$ git merge
	 添加远程仓库,之后就可以使用主机名来代替远程仓库
	 $ git remote add 主机名 远程仓库的地址
	 列出所有远程主机。
	 $ git remote
	 列出所有主机的名称和对应的网址
	 $ git remote -v
	 可以查看该主机的详细信息
	 $ git remote show 主机名
	 删除远程主机
	 $ git remote rm 主机名
	 对远程主机的改名
	 git remote rename 机原主名 新主机名
	 将master分支提交的历史记录推送至远程仓库GitHub
	 $ git push -u 主机名 master
	 将本地仓库的某个分支与远程主机的某个分支合并。
	 $ git push 主机名 本地分支名称：远程主机名称
	 查看当前仓库执行过的操作的日志，会显示当前仓库所有操作和对应的哈希值，可以使用下面命令
	 $ git reflog
	 推进至历史的某个状态
	 $ git reset --hard 哈希值
	 将远程仓库的某个分支中的文件下载到本地(本地没有此分支)
	 $ git checkout -b  新的分支名称 主机名/要下载到本地的分支名称
	 从远程仓库获取最新的此分支的最新状态与本地的分支合并。
	 $ git pull 主机名 远程分支名称：本地分支名称
	 直接从远程仓库下载一个新的项目(本地没有此项目),该命令会在本地主机生成一个目录，与远程主机的版本库同名
	 $ git clone  版本库地址
	 如果要指定不同的目录名，可以将目录名作为git clone命令的第二个参数。
	 $ git clone https://github.com/WangJieWJ/IntelliJ-IDEA.git download
	取回该远程主机中的所有分支的更新到本地
	$ git fetch 远程主机
	取回该远程主机中的特定分支的更新
	$ git fetch 远程主机名 分支名：
 #详细了解请看

[git伯乐在线](http://blog.jobbole.com/78960/)

[git教程](http://www.yiibai.com/git/)

[git使用基础](http://www.open-open.com/lib/view/open1332904495999.html)