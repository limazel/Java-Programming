public class Line {
    private Point begin, end;

    public Line(int x1, int x2, int y1, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void  setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void  setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int getEndX() {
      return  end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public String toString() {
        return "Line [begin=" + begin + ", end=" + end + "]";
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        int dx = getEndX() - getBeginX();
        int dy = getEndY() - getBeginY();
        if (dx == 0) throw new ArithmeticException("Eğim sonsuzdur (dikey doğru)");
        return (double) dy / dx;
    }
    
    public double distance(int x, int y) {
        return begin.distance(new Point(x, y));
    }

    public double distance(Point p) {
        return begin.distance(p);
    }

    public boolean intersects(Line another) {
        int x1 = getBeginX();
        int y1 = getBeginY();
        int x2 = getEndX();
        int y2 = getEndY();
        int x3 = another.getBeginX();
        int y3 = another.getBeginY();
        int x4 = another.getEndX();
        int y4 = another.getEndY();
    
        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (denominator == 0) return false;
    
        double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / denominator;
        double u = ((x1 - x3) * (y1 - y2) - (y1 - y3) * (x1 - x2)) / denominator;
    
        return (t >= 0 && t <= 1 && u >= 0 && u <= 1);
    }
}
