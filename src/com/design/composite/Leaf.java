package com.design.composite;

/**
 * @author gsliu
 * @date 2018-09-26 9:44
 * 树叶节点
 */
public class Leaf extends Component {

    public Leaf(String name){
        super(name);
    }

    @Override
    void add(Component component) {
        System.out.println("树叶节点没有此功能");
    }

    @Override
    void delete(Component component) {
        System.out.println("树叶节点没有此功能");
    }

    @Override
    void show(int index) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < index; i++){
            stringBuilder.append("-");
        }
        System.out.println(stringBuilder.toString() + this.name);
    }
}
