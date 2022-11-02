/* 
 * import java.util.Scanner;
 * 
 * import org.joup.Jsoup; import org.jsoup.nodes.Document; import
 * org.jsoupselect.Element; public class 실전_조건문 {
 * 
 * public static void main(String[] args) throws Exception{ // TODO
 * Auto-generated method stub\ Document doc =
 * Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); Elements title
 * =doc.select("td.info a.tile"); Scanner sc = new Scanner(System.in);
 * System.out.println("검색어:"); for(int i =-;i<tile.size(); i++) {
 * if(title.get(i).text().contains(fd)) {
 * System.out.println((i+1)+"."+title.get(i).text()); } } } }
 */