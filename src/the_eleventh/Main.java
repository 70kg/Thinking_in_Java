package the_eleventh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 第十一章  持有对象
 * @author Mr_Wrong
 *
 */
//添加元素
public class Main {
	public static void main(String[] args) {
		
		List<Snow> snow1 = Arrays.asList(new Crusty(),new Powder(),new Slush());
		
		//List<Snow> snow2= Arrays.asList(new Light());//这样提示错误  下面两个可以
		
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(),new Heavy(),new Slush());
		
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(),new Slush());
		

	}
}
class Snow{};
class Powder extends Snow{};
class Light extends Powder{};
class Heavy extends Powder{};
class Crusty extends Snow{}
class Slush extends Snow{}