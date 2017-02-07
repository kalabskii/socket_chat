package Main;

import java.util.Scanner;

import Serever.Server;
import client.Client;

/**
 * ��������� ����� ���������. �������� ������������ ����� main
 * 
 * 
 */
public class Main {

	/**
	 * ���������� ������������ � ������ ������ (������ ��� ������) � �������
	 * ���������� ���������������� ������
	 * 
	 * @param args
	 *            ��������� ��������� ������
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("��������� ��������� � ������ ������� ��� �������? (S(erver) / C(lient))");
		while (true) {
			char answer = Character.toLowerCase(in.nextLine().charAt(0));
			if (answer == 's') {
				new Server();
				break;
			} else if (answer == 'c') {
				new Client();
				break;
			} else {
				System.out.println("������������ ����. ���������.");
			}
		}
	}

}