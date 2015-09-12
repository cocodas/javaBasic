package collection.rendering_hints;

import java.awt.RenderingHints;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RenderingHintsMain {

	public static void main(String[] args) {

		RenderingHintsImpl renderingHints = new RenderingHintsImpl(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
	        renderingHints.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
	        renderingHints.put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
	        renderingHints.put(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
	        
	        Map<Object, Object> anotherMap = new HashMap<Object, Object>();
	        anotherMap.put(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
	        anotherMap.put(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
	        renderingHints.putAll(anotherMap);
	        
	        System.out.println("the key set of the renderingHints is ");
	        Set<Object> keySet = renderingHints.keySet();
	        Iterator<Object> itr = keySet.iterator();
	        while (itr.hasNext())
	        {
	            System.out.print(itr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	        
	        System.out.println("the values of the renderingHints is ");
	        Collection<Object> collectionValues = renderingHints.values();
	        itr = collectionValues.iterator();
	        while (itr.hasNext())
	        {
	            System.out.print(itr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	        
	        System.out.println("the entry set of the renderingHints is ");
	        Iterator<Entry<Object, Object>> eitr;
	        Set<Entry<Object, Object>> entrySet = renderingHints.entrySet();
	        eitr = entrySet.iterator();
	        while (eitr.hasNext())
	        {
	            System.out.println(eitr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	        
	        System.out.println("the renderingHints contains Key  KEY_TEXT_ANTIALIASING :" + renderingHints.containsKey(RenderingHints.KEY_TEXT_ANTIALIASING));
	        System.out.println("the renderingHints contains Value VALUE_TEXT_ANTIALIAS_ON:" + renderingHints.containsValue(RenderingHints.VALUE_TEXT_ANTIALIAS_ON));
	        System.out.println("the size of the renderingHints is " + renderingHints.size());
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	        
	        renderingHints.clear();
	        if (renderingHints.isEmpty())
	            System.out.println("the renderingHints is empty");
	        else
	            System.out.println("the renderingHints is not empty");
	}

}
