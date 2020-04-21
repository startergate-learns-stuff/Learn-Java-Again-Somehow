public class GSM07 {
    public static void main(String[] args) {
        BookDTO[] books = {
                new BookDTO("코스모스", "칼 세이건", 18500, 719),
                new BookDTO("언어의 온도", "이기주", 13800, 308),
                new BookDTO("자바", "최호승", 13800, 308)
        };

        for (BookDTO book: books) {
            System.out.println(book);
        }
    }
}
