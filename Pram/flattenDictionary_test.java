//anuja.nagare@uga.edu

package flattenDictionary_test;
import java.util.*;
import java.util.Map.Entry;

//input:  dict = {
//            "Key1" : "1",
//            "Key2" : {
//                "a" : "2",
//                "b" : "3",
//                "c" : {
//                    "d" : "3",
//                    "e" : "1"
//                }
//            }
//        }
//
//output: {
//            "Key1" : "1",
//            "Key2.a" : "2",
//            "Key2.b" : "3",
//            "Key2.c.d" : "3",
//            "Key2.c.e" : "1"
//        }

public class flattenDictionary_test {
	private static HashMap<String, String> result = new HashMap<String, String>();

	public static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict){
		for ( Map.Entry<String, Object> entry : dict.entrySet()) {

			String key = entry.getKey();
			Object value = entry.getValue();

			if(value.getClass() == String.class){
				concatKeyValues(key,(String) value);
			}//if
			else {
				getKeyValueSO(key,value);
			}//else

		}//for
		return result;
	}//flattenDictionary

	public static HashMap<String, String>  getKeyValueSO(String prevKey,Object prevValue) {
		HashMap<String, String> temp = new HashMap<String, String>();

		for ( Entry<String, String> entry : ((HashMap<String, String>) prevValue).entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();

			if(value.getClass() == String.class){
				concatKeyValues(prevKey + "." +key,(String) value);
			}//if
			else {
				getKeyValueSO(prevKey + "." +key,value);
			}//else
		}//for
		return temp;
	}//getKeyValueSO


	public static void concatKeyValues(String k, String v) {
		result.put(k, v);
	}//concatKeyValues



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> dict = new HashMap<String, Object>();
		HashMap<String, String> out = new HashMap<String, String>();

		result.clear();
		HashMap<String, Object> dictP1 = new HashMap<String, Object>();
		HashMap<String, Object> dictP2 = new HashMap<String, Object>();
		HashMap<String, Object> dictP3 = new HashMap<String, Object>();

		//		{"Key":{"a":"2","b":"3"}}

		//		dict.put("Key1", "1");
		//		dictP3.put("d" , "3");
		//		dictP3.put("e" , "1");

		dictP2.put("a" , "2");
		dictP2.put("b" , "3");

		dict.put("Key" , dictP2 );

		out = flattenDictionary(dict);
		System.out.println(out);
	}

}
