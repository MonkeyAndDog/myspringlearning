# Spring学习项目
IOC
---
1. 注入类型
	1. setter（重要）Setter-based dependency injection
	2. 构造方法注入 Constructor-based dependency injection
	3. beans.xml
2. id--VS--name
	* beans.xml
3. 简单属性的注入
	1. <property value=""/>
	2. UserDAOImpl
	3. 连接池需要
4. bean的scope属性
	1. singleton单例
	2. prototype原型
	3. 官方文档，scope
5. 集合注入
	1. 设置好set，get方法
	2. 在bean中设置好值
6. 自动装配
	* auto-wire
7. 生命周期
	* lazy-init
	* init-method,destory-method
8. 使用Annotation配置Spring
	1. 命名空间的配置
	2. <context:annotation-config></context:annotation-config>
	3. 学到的注解 
		1. @Autowired，默认是byType，当多个相同类型的type存在时，要和@Qualifier联合使用
		2. @Qualifier使用byName
		3. 如果使用Qualifier要写在set参数上
		4. @Resource,默认使用byName（name属性指定了从容器中找哪一个key符合的对象），找不到再使用byTpye
		5. @Component,初始化key默认是类名小写，value就是对象，一般要定义名字
		6. @Scope，@PostConstruct，@PreDestroy
---
1. 动态代理
	* annotation包中相关示例及Loginterceptor类示例
2. AOP配置
	1. <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
	2. 导入相关的Aspect包
	3. 实例化@Aspect，如果定义了component-scan，那么要注解@component
	4. 织入点语法---Spring文档pointcut
	5. 奇葩方法：
	
	```
	@Pointcut("execution(public * com.mrhu.spring.dao..*.*(..))")
	public void myMethod(){};
	@Before("myMethod()")
	//	@Before("execution(public void com.mrhu.spring.dao.impl.annotation.UserDAOImpl.save(com.mrhu.spring.model.annotation.User))")
	//	@Before("execution(public * com.mrhu.spring.dao..*.*(..))")
	public void before() {
		System.out.println("method start");
	}
	```
	
	
	
	
	
				

