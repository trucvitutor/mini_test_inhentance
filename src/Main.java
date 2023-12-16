import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book nguNgon = new ProgrammingBook("i909", "ngụ ngôn", 120.0, "trúc vi", "java", "vietnam");

        Book ngonTinh = new ProgrammingBook("i901", "ngôn tình ", 12.0, "phương", "PHP", "vietnam");
        Book taiChinh = new ProgrammingBook("i902", " tài chính", 190.0, "bảo", "java", "vietnam");
        Book nauAn = new ProgrammingBook("i903", "nấu ăn", 180.0, "tiểu vi", "Python", "vietnam");
        Book kheoAnKheoNoi = new ProgrammingBook("i904", "khéo ăn khéo nói", 12880.0, "siêu anh hùng",
                "java",
                "vietnam");
        Book anQua = new FictionBook("y111", "ăn quả nhớ kẻ trồng cây", 700.0, "c#", "vien tuong 1");
        Book tieuVi = new FictionBook("y111", "tiểu vi khóc vì hạnh phúc", 2.0, "java", "thế giới");
        Book trap = new FictionBook("y111", "bảo trap boi", 10.0, "c#", "vien tuong 1");
        Book liLe = new FictionBook("y111", "anh phương độ lí", 30.0, "c#", "vien tuong 1");
        Book couple = new FictionBook("y111", "bảo lụy tình , tiểu vi hong có tình yêu , cặp đôi song sát",
                700.0,
                "c#",
                "thế giới");
//        bookList.add(nguNgon);
//        bookList.add(ngonTinh);
//        bookList.add(taiChinh);
//        bookList.add(nauAn);
//        bookList.add(kheoAnKheoNoi);
//        bookList.add(anQua);
//        bookList.add(tieuVi);
//        bookList.add(trap);
//        bookList.add(liLe);
//        bookList.add(couple);
        bookList = Arrays.asList(nguNgon, ngonTinh, taiChinh, nauAn, kheoAnKheoNoi, anQua, tieuVi, trap, liLe,
                couple);


        double price = 0;
        for (Book b : bookList) {
            price += b.getPrice();
        }
        System.out.println("Tong tien: " + price);
        int count = 0;
        int count1=0;
        int count2=0;
        for (Book book : bookList) {
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals("java")) {
                    count++;
                }
            }else if(book instanceof FictionBook){
                if(((FictionBook) book).getCategory().equals("vien tuong 1")){
                    count1++;
                }
            }
        }
        for (Book book:bookList) {
            if(book instanceof FictionBook){
                if( book.getPrice()<100.0){
                    count2++;
                }
            }
        }
        System.out.println("So luong sach java la: " + count);
        System.out.println("so luong vien tuong 1: "+ count1);
        System.out.println("gia duoi 100 la: "+ count2);


    }
}