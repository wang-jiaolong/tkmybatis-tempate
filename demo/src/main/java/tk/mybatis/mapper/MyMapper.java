package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description: 继承类
 * @Author: Jiaolong
 * @Date: 2021/3/20 11:34
 * 不能被扫描到，所以不能放在SpringBootApplication所在包，因为自动扫描
 */

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}