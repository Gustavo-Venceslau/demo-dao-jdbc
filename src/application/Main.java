package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Department department = new Department(2, null);

        /*
        System.out.println("==== Insert Test ====");
        Seller newSeller = new Seller(null, "greg", "greg@gmail.com,", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Done! New Id = " + newSeller.getId());

         */
        System.out.println();
        System.out.println("==== Update Test ====");
        Seller seller = sellerDao.findById(9);
        seller.setName("Gustavo de Almeida");
        sellerDao.update(seller);
        System.out.println("Update Completed!");

        System.out.println();
        System.out.println("==== FindById Test ====");
        seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();
        System.out.println("==== FindByDepartment Test ====");
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj: list){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("==== FindAll Test ====");
        list = sellerDao.findAll();
        for(Seller obj: list){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("==== Delete Test ====");
        System.out.print("Enter seller number to delete: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Completed!");

    }
}