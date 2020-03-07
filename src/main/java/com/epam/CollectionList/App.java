package com.epam.CollectionList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        CustomList<Integer> l1 = new CustomList<Integer>();
        l1.add(8);
        l1.add(4);
        l1.add(12);
        l1.add(78);
        LOGGER.debug(l1);
        l1.remove(2);
        LOGGER.debug(l1);
        LOGGER.debug(l1.get(0) );
        LOGGER.debug(l1.get(1) );
        LOGGER.debug(l1.size());
        CustomList<String>l2=new CustomList<String>();
        l2.add("Vyshu");
        l2.add("Aishu");
        l2.add("Tej");
        LOGGER.debug(l2);
        LOGGER.debug(l2.size());
        l2.remove(2);
        LOGGER.info(l1);
        LOGGER.debug(l2);
    }
}
