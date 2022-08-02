package com.acmeflix.repository;
import com.acmeflix.domain.BaseModel;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class AccountRepositoryImpl implements BaseRepository {


    @Override
    public BaseModel create(BaseModel entity) {
        return null;
    }

    @Override
    public void update(BaseModel entity) {

    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void delete(BaseModel entity) {

    }

    @Override
    public void deleteById(Object o) {

    }

    @Override
    public boolean exists(BaseModel entity) {
        return false;
    }

    @Override
    public BaseModel get(Object o) {
        return null;
    }
}
