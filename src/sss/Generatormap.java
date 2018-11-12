package sss;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Generatormap {
	public void generator()throws Exception{
		List<String> warnings=new ArrayList<String>();
		boolean overwrite = true;
//		导入配置表e.g-mybatis-generator.xml
		File configFile=new File("mybatis-generator.xml");
//		解析
		ConfigurationParser cp=new ConfigurationParser(warnings);
		Configuration config=cp.parseConfiguration(configFile);
//		是否覆盖
		DefaultShellCallback dsc=new DefaultShellCallback(overwrite);
		MyBatisGenerator mg=new MyBatisGenerator(config, dsc, warnings);
		System.out.println("完成");
		mg.generate(null);
	}
	public static void main(String[] args) throws Exception  {
		try {
			Generatormap generatormap = new Generatormap();
			generatormap.generator();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("nonono");
		}
		
	}
}
