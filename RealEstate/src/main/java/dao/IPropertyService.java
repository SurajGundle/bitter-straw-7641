package src.main.java.dao;

import src.main.java.bean.Property;
import src.main.java.bean.PropertyCriteria;

import java.util.List;

public interface IPropertyService {

    public Property addProperty(Property property);

    public Property editProperty(Property property);

    public Property removeProperty(int proId);

    public Property viewProperty(int proId);

    public List<Property> listAllProperties();

    public List<Property> listPropertyByCriteria(PropertyCriteria criteria);

}
