import java.util.List;

public class Response {

    private String q;
    private List<Hits> hits;

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public List<Hits> getHits() {
        return hits;
    }

    public void setHits(List<Hits> hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        return "Response{" +
                "q='" + q + '\'' +
                ", hits=" + hits +
                '}';
    }
}
