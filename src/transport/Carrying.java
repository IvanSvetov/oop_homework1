package transport;

public enum Carrying {

    N1(0.0f, 3.50f),
    N2(3.51f, 12f),
    N3(12.1f, 50f);
    private float downLoadCarrying;
    private float upLoadCarrying;
    Carrying(float downLoadCarrying, float upLoadCarrying) {
        this.downLoadCarrying = downLoadCarrying;
        this.upLoadCarrying = upLoadCarrying;
    }

    public float getDownLoadCarrying() {
        return downLoadCarrying;
    }

    public void setDownLoadCarrying(float downLoadCarrying) {
        this.downLoadCarrying = downLoadCarrying;
    }

    public float getUpLoadCarrying() {
        return upLoadCarrying;
    }

    public void setUpLoadCarrying(float upLoadCarrying) {
        this.upLoadCarrying = upLoadCarrying;
    }

    @Override
    public String toString() {
            return "Грузоподъемность: от " + getDownLoadCarrying() + " тонн до " + getUpLoadCarrying() + " тонн";
    }
}
