package xnbb.sys.serial;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import xnbb.sys.entity.SysUser;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class SerializationOptimizerImpl implements SerializationOptimizer {

    @Override
    public Collection<Class> getSerializableClasses() {
        List<Class> list = new LinkedList<Class>();
        list.add(SysUser.class);
        return list;
    }
}
