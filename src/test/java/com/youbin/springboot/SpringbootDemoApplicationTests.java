package com.youbin.springboot;

import com.youbin.springboot.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.youbin.springboot.service.HelloService;

import java.util.Iterator;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

	@Autowired
	private  Person person;

	@Autowired
    private HelloService helloService;

    @Test
    public void testConfiguraton(){
        System.out.println(helloService);

    }

	@Test
	public void contextLoads() {
        System.out.println(person.toString());
		Map<String,String> maps = person.getMaps();
		for (Map.Entry<String,String> entry : maps.entrySet()){
			System.out.println(entry.getKey() +"----"+ entry.getValue());
		}
		for(String key:maps.keySet()){
			System.out.println(key+ "-----" );
		}
		for(String value:maps.values()){
			System.out.println(value+ "-----" );
		}

		Iterator<Map.Entry<String,String>> iterator = maps.entrySet().iterator();
		while (iterator.hasNext()){
			Map.Entry<String,String> entry = iterator.next();
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}

	}

}
