package inheritance;
public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
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

    public static class Point3D extends Point2D {
        private float z = 0.0f;

        public Point3D() {
        }

        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public void setXYZ(float x, float y, float z) {
            super.setXY(x, y);
            this.z = z;
        }

        public float[] getXYZ() {
            float arr[] = {this.getX(), this.getY(), this.z};
            return arr;
        }


        public String toString() {
            return "(" + getX() + "," + getY() + "," + getZ() + ")";
        }
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 7);
        Point3D point3D = new Point3D(1, 1, 7);
        System.out.println(point2D);
        System.out.println(point3D);
    }
}
