package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.Person3;

class JsonTest {

	@Test
	public void test1() {
		Person3 Person3 = new Person3(1, "Hal");
		// 創建 Gson 物件實例
		Gson gson = new Gson();
		// toJson方法可以把 java物件 轉成 JSON字串
		String Person3JsonString = gson.toJson(Person3);
		System.out.println(Person3JsonString);
		// fromJson 是把 JSON字串 轉換回 Java物件
		// 第一個參數 是 JSON字串
		// 第二個參數 是 轉換回去的 Java物件 Type
		Person3 Person31 = gson.fromJson(Person3JsonString, Person3.class);
		System.out.println(Person31);
		System.out.println("==============================================================");
	}

//	   List & JSON 互相轉換
	@Test
	public void test2() {
		List<Person3> Person3List = new ArrayList<>();

		Person3List.add(new Person3(1, "Bat"));
		Person3List.add(new Person3(2, "Cat"));

		Gson gson = new Gson();

		// 把List 轉成 JSON字串
		String Person3ListJsonString = gson.toJson(Person3List);
		System.out.println(Person3ListJsonString);
		
		// 需要寫一個 public class PersonListType extends TypeToken<ArrayList<Person3>>
		List<Person3> list = gson.fromJson(Person3ListJsonString, new PersonListType().getType());
		System.out.println(list);
		Person3 Person3 = list.get(0);
		System.out.println(Person3);
		System.out.println("==============================================================");

	}

//	map & JSON 互相轉換
	@Test
	public void test3() {
		Map<Integer, Person3> Person3Map = new HashMap<>();

		Person3Map.put(1, new Person3(1, "Lex"));
		Person3Map.put(2, new Person3(2, "Clark"));

		Gson gson = new Gson();
		// 把 map 集合 轉換成 JSON 字串
		String Person3MapJsonString = gson.toJson(Person3Map);
		System.out.println(Person3MapJsonString);

//	        Map<Integer,Person3> Person3Map2 = gson.fromJson(Person3MapJsonString, new Person3MapType().getType());
		Map<Integer, Person3> Person3Map2 = gson.fromJson(Person3MapJsonString,
				new TypeToken<HashMap<Integer, Person3>>() {}.getType());

		System.out.println(Person3Map2);
		Person3 p = Person3Map2.get(1);
		System.out.println(p);

	}

}
