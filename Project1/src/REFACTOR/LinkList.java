package REFACTOR;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.util.*;

	class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}

		Node(int x, Node t) {
			data = x;
			next = t;
		}

		public String toString() {
			return data + "-------->";
		}
	}

	public class LinkList {
		Node head;

		LinkList() {
			head = null;
		}

		public void add(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
			} else {
				Node x = head;
				while (x.next != null) {
					x = x.next;
				}
				x.next = newNode;
			}
		}

		public void in() {
			Node x = head;
			while (x != null) {
				System.out.print(x.data + " ");
				x = x.next;
			}
			System.out.println();
		}

		public int TongLe() {
			int tong = 0;
			Node x = head;
			while (x != null) {
				if (x.data % 2 != 0) {
					tong += x.data;
				}
				x = x.next;
			}
			return tong;
		}

		public double tbcChan() {
			int tong = 0;
			int dem = 0;
			Node x = head;
			while (x != null) {
				if (x.data % 2 == 0) {
					tong += x.data;
					dem++;
				}
				x = x.next;
			}
			if (dem > 0) {
				return (double) tong / dem;
			} else {
				return 0;
			}
		}

		public int ptuLonHon(int value) {
			int dem = 0;
			Node x = head;
			while (x != null) {
				if (x.data > value) {
					dem++;
				}
				x = x.next;
			}
			return dem;
		}

		public int ptuKhacNhau() {
			Set<Integer> s = new HashSet<Integer>();
			Node x = head;
			while (x != null) {
				s.add(x.data);
				x = x.next;
			}
			return s.size();
		}

		public void HoanVtri() {
			if (head == null || head.next == null) {
				return;
			}

			Node x = head;
			Node c = null;
			while (x.next != null) {
				c = x;
				x = x.next;
			}

			x.next = head.next;
			head.next = null;
			c.next = head;
			head = x;
		}

		public int InKeCuoi() {
			if (head == null || head.next == null) {
				return -1;
			}

			Node x = head;
			while (x.next.next != null) {
				x = x.next;
			}

			return x.data;
		}

		public void DaoList() {
			Node c = null;
			Node x = head;
			Node next = null;

			while (x != null) {
				next = x.next;
				x.next = c;
				c = x;
				x = next;
			}

			head = c;
		}

		public void docfile() {
			try {
				File f = new File("D:\\Solieu.txt");
				if (f.exists()) {
					System.out.print("đã mở được File");
					Scanner read = new Scanner(f);
					Scanner line1 = new Scanner(read.nextLine());
					int n = line1.nextInt();
					System.out.print(n);
					while (read.hasNext()) {
						Scanner line2 = new Scanner(read.nextLine());
						while (!line2.hasNextBoolean()) {
							int x = line2.nextInt();
							this.add(x);
						}
					}
				} else
					System.out.print("File không tồn tại");
			} catch (Exception e) {
			}
		}

		public static void main(String[] args) {
			LinkList l = new LinkList();
			l.add(1);
			l.add(2);
			l.add(3);
			l.add(4);
			l.add(5);
			l.in();
			System.out.println("Tổng các số lẻ: " + l.TongLe());
			System.out.println("Trung bình cộng các số chẵn: " + l.tbcChan());
			System.out.println("Số phần tử lớn hơn 3: " + l.ptuLonHon(3));
			System.out.println("Số phần tử khác nhau: " + l.ptuKhacNhau());
			l.HoanVtri();
			System.out.println("Danh sách liên kết sau khi hoán vị phần tử đầu và phần tử cuối:");
			l.in();
			System.out.println("Giá trị của nút kế cuối: " + l.InKeCuoi());
			l.DaoList();
			System.out.println("Danh sách liên kết sau khi đảo:");
			l.in();
		}
}
