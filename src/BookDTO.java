public class BookDTO {
    private String title;
    private String name;
    private int price;
    private int page;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public BookDTO() { }

    public BookDTO(String title, String name, int price, int page) {
        this.title = title;
        this.name = name;
        this.price = price;
        this.page = page;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", page=" + page +
                '}';
    }
}
