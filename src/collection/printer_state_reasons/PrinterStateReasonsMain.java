package collection.printer_state_reasons;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.standard.PrinterStateReason;
import javax.print.attribute.standard.Severity;

public class PrinterStateReasonsMain {

	public static void main(String[] args) {

		 PrinterStateReasonsImpl printerStateReasons = new PrinterStateReasonsImpl();
	        printerStateReasons.put(PrinterStateReason.CONNECTING_TO_DEVICE,Severity.ERROR);
	        printerStateReasons.put(PrinterStateReason.COVER_OPEN,Severity.REPORT);
	        printerStateReasons.put(PrinterStateReason.INPUT_TRAY_MISSING, Severity.WARNING);
	 
	        System.out.println("the key set of the printerStateReasons is ");
	        Set<PrinterStateReason> keySet = printerStateReasons.keySet();
	        Iterator<PrinterStateReason> itr = keySet.iterator();
	        while (itr.hasNext())
	        {
	            System.out.print(itr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	 
	        System.out.println("the values of the printerStateReasons is ");
	        Collection<Severity> collectionValues = printerStateReasons.values();
	        Iterator<Severity > citr = collectionValues.iterator();
	        while (citr.hasNext())
	        {
	            System.out.print(citr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println("*******************************" + "\n");
	        
	        System.out.println("the entry set of the printerStateReasons is ");
	        Iterator<Entry<PrinterStateReason, Severity>> eitr;
	        Set<Entry<PrinterStateReason, Severity>> entrySet = printerStateReasons.entrySet();
	        eitr = entrySet.iterator();
	        while (eitr.hasNext())
	        {
	            System.out.println(eitr.next() + "\t");
	        }
	        System.out.println("*******************************" + "\n");
	        
	        System.out.println("the printerStateReasons contains Key CONNECTING_TO_DEVICE :" + printerStateReasons.containsKey(PrinterStateReason.CONNECTING_TO_DEVICE));
	        System.out.println("the printerStateReasons contains Value ERROR :" + printerStateReasons.containsValue(Severity.ERROR));
	        System.out.println("the size of the printerStateReasons is " + printerStateReasons.size());
	        System.out.println("*******************************" + "\n");
	        
	        printerStateReasons.clear();
	        if (printerStateReasons.isEmpty())
	            System.out.println("the printerStateReasons is empty");
	        else
	            System.out.println("the printerStateReasons is not empty");
	}

}
