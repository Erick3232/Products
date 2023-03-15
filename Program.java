package Section14.Polimorfism.Fix;

import java.util.*;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) throws ParseException{
        
        Scanner scanner = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Product #" + i + " data:");
            
            System.out.print("Commom, used or imported (c/u/i)? ");
            char choose = scanner.next().charAt(0);
            if(choose == 'i'){

                System.out.print("Name: ");
                String name = scanner.next();

                System.out.print("Price: ");
                double price = scanner.nextDouble();

                System.out.print("Custmoms fee: ");
                double customFee = scanner.nextDouble();

                ImportedProduct ip = new ImportedProduct(name, price, customFee);
                list.add(ip);

            } else if(choose == 'c'){

                System.out.print("Name: ");
                String name = scanner.next();

                System.out.print("Price: ");
                double price = scanner.nextDouble();

                Product product = new Product(name, price);
                list.add(product);
            } else if(choose == 'u'){

                System.out.print("Name: ");
                String name = scanner.next();

                System.out.print("Price: ");
                double price = scanner.nextDouble();

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                UsedProduct up = new UsedProduct(name, price, date);
                list.add(up);
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product product : list){
            System.out.println(product.priceTag());
        }
        scanner.close();
    }
}
