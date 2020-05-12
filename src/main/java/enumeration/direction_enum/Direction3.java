package enumeration.direction_enum;

/**
 * @author liushuai
 * @create 2020/5/12
 */
public enum Direction3 {
    FRONT("前") {
        @Override
        public void show() {
            System.out.println("前");
        }
    },
    BEHIND("后") {
        @Override
        public void show() {
            System.out.println("后");
        }
    },
    LEFT("左") {
        @Override
        public void show() {
            System.out.println("左");
        }
    },
    RIGHT("右") {
        @Override
        public void show() {
            System.out.println("右");
        }
    };

    private String name;

    Direction3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
