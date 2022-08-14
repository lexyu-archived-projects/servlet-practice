package test;

import java.util.Iterator;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class I18NTest {

	@Test
	public void testLocale() {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		System.out.println(Locale.TAIWAN);
		System.out.println(Locale.US);
	
	}
	
	 @Test
    public void testI18n(){
        // 創建 Locale 物件
        Locale locale = Locale.TAIWAN;
        // 指定 baseName & Locale物件，讀取 相應的配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", locale);

        System.out.println("username：" + bundle.getString("username"));
        System.out.println("password：" + bundle.getString("password"));
        System.out.println("Sex：" + bundle.getString("sex"));
        System.out.println("age：" + bundle.getString("age"));
    }

}
