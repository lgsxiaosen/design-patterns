package com.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gsliu
 * @date 2018-09-26 9:40
 * 树枝结构
 */
public class Composite extends Component {

    List<Component> components = new ArrayList<>();

    public Composite(String name){
        super(name);
    }

    @Override
    void add(Component component) {
        components.add(component);
    }

    @Override
    void delete(Component component) {
        components.remove(component);
    }

    @Override
    void show(int index) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < index; i++){
            stringBuilder.append("-");
        }
        System.out.println(stringBuilder.toString() + this.name);
        for(Component component : components){
            component.show(index + 2);
        }
    }
}
