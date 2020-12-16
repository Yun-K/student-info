package controller;

/**
 * Description: <br/>
 * 所有的操作无非就是增删改查，当gui部分收到操作后，会通过这个package来增删改查. 这个package的目的是降低耦合， 避免GUI类直接对存放所有数据的model
 * package进行调用, 易于整个项目日后的debug和维护。
 * 
 * 使用者通过gui进行操作的时候，必须需要通过controller。
 * 
 * 然后controller传递参数，调用model里面的函数对所对应的数据执行增删改查
 * 
 * model package里面的数据更新完毕后，会再次调用controller，controller再通知gui更新视图。
 * 
 * @author Yun Zhou 300442776
 * @version
 */
public abstract class Operation {

    /**
     * Description: <br/>
     * 在执行任何操作前都需要验证身份，所以这个method是这个用处。
     * 
     * @author Yun Zhou
     */
    private void askPersonInfo() {

    }

    public Operation() {
        // TODO Auto-generated constructor stub
    }
}
