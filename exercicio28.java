package exercicio28;
import java.util.PriorityQueue;
import java.util.Scanner;
public class exercicio28 {
public static void main(String[] args) {
	
	
Scanner LerS = new Scanner(System.in);
PriorityQueue <Integer> pq1 = new PriorityQueue <Integer>();
int variavel;
System.out.println("Qual � a primeira vari�vel?");
variavel = LerS.nextInt();
pq1.add(variavel);
int variavel1;
System.out.println("Qual � a segunda vari�vel?");
variavel1 = LerS.nextInt();
pq1.add(variavel1);
int variavel2;
System.out.println("Qual � a terceira vari�vel?");
variavel2 = LerS.nextInt();
pq1.add(variavel2);
int variavel3;
System.out.println("Qual � a quarta vari�vel?");
variavel3 = LerS.nextInt();
pq1.add(variavel3);
int variavel4;
System.out.println("Qual � a quinta variavel?");
variavel4 = LerS.nextInt();
pq1.add(variavel4);
int variavel5;
System.out.println("Qual � a sexta vari�vel?");
variavel5 = LerS.nextInt();
pq1.add(variavel5);
System.out.println("Ordem:" +pq1);
System.out.print("A vari�vel � cabe�a � " + pq1.element());
}
}