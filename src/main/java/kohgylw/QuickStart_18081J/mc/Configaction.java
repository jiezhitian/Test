package kohgylw.QuickStart_18081J.mc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration//完全替代XML配置文件
@ComponentScan("kohgylw.QuickStart_18081.service")//自动扫描包
public class Configaction {
	@Bean  //类似于<bean>标签
	@Scope("prototype")//也可以设定作用域
	public Cat getCat(){
		Cat cat=new Cat("汤姆");
		return cat;
	}

}
