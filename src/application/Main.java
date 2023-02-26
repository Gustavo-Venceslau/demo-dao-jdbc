package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== FindById Test ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();
        System.out.println("==== FindByDepartment Test ====");
        Department department = new Department(2, null);
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

    }
}