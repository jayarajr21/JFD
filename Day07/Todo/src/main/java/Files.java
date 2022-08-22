public class Files {
    private int id;
    private String note;

    public Files(int id, String notes) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void Todo(int id, String note) {
        this.id = id;
        this.note = note;
    }
}
