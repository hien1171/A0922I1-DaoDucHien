package inheritance;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {this.x,this.y};
        return arr;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public static class MovablePoint extends Point {
        private float xSpeed = 0.0f;
        private float ySpeed = 0.0f;

        public MovablePoint() {
        }

        public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float getxSpeed() {
            return xSpeed;
        }

        public void setxSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public float getySpeed() {
            return ySpeed;
        }

        public void setySpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }

        public float[] getSpeed(float xSpeed, float ySpeed) {
            float[] arr= {this.xSpeed,this.ySpeed};
            return arr;
        }


        public String toString() {
            return super.toString() + ", speed = (" + this.xSpeed + ", " + this.ySpeed + ")";
        }

        public String move() {
            this.setX(this.getX() + this.xSpeed);
            this.setY(this.getY() + this.ySpeed);
            return "(" + this.getX() + "," + this.getY() + ")";
        }
    }

    public static void main(String[] args) {
        Point point = new Point(1, 4);
        MovablePoint points = new MovablePoint(1, 4, 5, 6);
        System.out.println(point);
        System.out.println(points);
        System.out.println(points.move());
    }
}
