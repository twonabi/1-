import java.util.ArrayList;
import java.util.Scanner;

public class MovieProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieOperation mo = new MovieOperation();
        mo.pre();

        while (true) {
            System.out.println("======== 장르별 영화 검색 프로그램(그룹 이름) ==========");
            System.out.println("1.영화입력(I) 2.영화출력(P) 3.영화검색(S) 4.종료(E)");
            System.out.println("=============================================");
            System.out.print("메뉴입력:");

            String menu = sc.nextLine().toUpperCase();

            switch (menu) {
                case "I":
                    //제목, 주연, 러닝타임, 평점, 장르
                    //DTO Data Transfer Object
                    //VO View Object
                    System.out.println("영화 제목 입력하세요");
                    String title = sc.nextLine();
                    System.out.println("영화 제목 : " + title);

                    System.out.println("주연을 입력하세요");
                    String major = sc.nextLine();
                    System.out.println("영화 주연 : " + major);

                    System.out.println("상영시간을 입력하세요");
                    int runTime = sc.nextInt();
                    System.out.println("상영시간 : " + runTime);

                    sc.nextLine();

                    System.out.println("평점을 입력하세요");
                    float rating = sc.nextFloat();
                    System.out.println("평정 : " + rating);

                    sc.nextLine();

                    System.out.println("장르를 입력하세요");
                    String genre = sc.nextLine();
                    System.out.println("장르 :" + genre);

                    mo.enter(title,major,runTime,rating,genre);

                    break;

                case "P":
                    mo.print();
                case "S":
                    System.out.println("검색할 장르를 입력하세요");
                    String genreNumber = sc.nextLine();

                    mo.search(genreNumber);


                case "E","-1":
                    System.out.println("종료 되었습니다");

                default:
                    System.out.println("오류입니다. I, P, S, E 중 입력하세요.");

            }

        }


    }
}