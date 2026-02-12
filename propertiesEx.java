package javaPrac;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class propertiesEx {

	public static void main(String[] args) {
/**Create, Set, Get and Remove Properties
Question:
Write a Java program to:
Create a Properties instance
Add 4 properties (name, age, city, course)
Retrieve and print all values
Remove the city property
Print remaining properties **/
		
        Properties prop = new Properties();
        
        prop.setProperty("name", "Monie");
        prop.setProperty("age", "21");
        prop.setProperty("city", "Bangalore");
        prop.setProperty("course", "CSE");

        System.out.println("All Properties:");

        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key + " : " + prop.getProperty(key));
        }
        
        prop.remove("city");

        System.out.println("\nAfter Removing 'city' ");
        
        for (String key : prop.stringPropertyNames()) {
            System.out.println(key + " : " + prop.getProperty(key));
        }
        System.out.println("\n\n\n");
        
/**  Store and Load Properties from a File
Question:
Write a Java program to:
Create a Properties object
Add database configuration (url, username, password)
Store it in a file named config.properties
Load the same file into another Properties object
Print the loaded values**/
        
        try {
       
            prop.setProperty("url", "jdbc:mysql://localhost:3306/mydb");
            prop.setProperty("username", "root");
            prop.setProperty("password", "admin123");

            FileOutputStream fos = new FileOutputStream("config.properties");
            prop.store(fos, "Database Configuration");
            fos.close();

            System.out.println("Properties stored successfully!\n");

            Properties loadedProp = new Properties();
            
            FileInputStream fis = new FileInputStream("config.properties");
            loadedProp.load(fis);
            fis.close();

            System.out.println("Loaded Properties:");
            System.out.println("URL: " + loadedProp.getProperty("url"));
            System.out.println("Username: " + loadedProp.getProperty("username"));
            System.out.println("Password: " + loadedProp.getProperty("password"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n\n");
        
 /** Default Properties and getProperty() with Default Value
Question:
Write a Java program to:
Create a default Properties object with values:
country = India
currency = INR
Create another Properties object that uses the default one
Add only one property: language = English
Retrieve:
language
country
currency
timezone (use getProperty() with default value "IST")**/
        
        Properties defaultProp = new Properties();
        defaultProp.setProperty("country", "India");
        defaultProp.setProperty("currency", "INR");

//        Properties prop = new Properties(defaultProp);
        prop.setProperty("language", "English");

        System.out.println("Language: " + prop.getProperty("language"));
        System.out.println("Country: " + prop.getProperty("country"));   // From default = null
        System.out.println("Currency: " + prop.getProperty("currency")); // From default
        System.out.println("Timezone: " + prop.getProperty("timezone", "IST"));
	}

}
