/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.ProductModel;
import Query.ProductQuery;
import com.sun.xml.rpc.spi.model.Model;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ADMIN
 */
public class ProductController extends BaseController {
    
    ProductQuery query = new ProductQuery();
    
    public ResultSet get() {
        String sql = this.query.get;
        return this.get(sql);
    }
   public boolean create(ProductModel model) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getType());
        map.put(3, model.getStock());
        map.put(4, model.getPrice());
        map.put(5, model.getExpired());
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
}
    

