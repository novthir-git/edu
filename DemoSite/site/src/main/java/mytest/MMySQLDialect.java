package mytest;
import java.sql.Types;

import org.broadleafcommerce.core.catalog.domain.CategoryImpl;
import org.hibernate.Hibernate;
import org.hibernate.dialect.MySQLDialect;
import org.hibernate.dialect.function.StandardSQLFunction;

public class MMySQLDialect extends MySQLDialect {
    public MMySQLDialect () {
    	
        super();
        registerHibernateType(Types.DECIMAL, "BIG_INTEGER");
        registerHibernateType(Types.LONGVARCHAR, "TEXT");
        registerFunction("group_concat", new StandardSQLFunction(  
                "STRING"));  
    }
}
