package com.liveasy.roop.demo.service.impl.impl;

import com.liveasy.roop.demo.entity.Load;
import com.liveasy.roop.demo.repository.loadrepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class loadservice {
    private loadrepo loadrepo;

    public boolean addLoad(Load load) {
        try {
            loadrepo.save(load);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Load> getLoadsByShipperId(String shipperId) {
        return loadrepo.findByShipperId(shipperId);
    }

    public Load getLoadById(Long loadId) {
        return loadrepo.findById(loadId).orElse(null);
    }

    public boolean updateLoad(Long loadId, Load load) {
        try {
            Load existingLoad = loadrepo.findById(loadId).orElse(null);
            if (existingLoad != null) {
                load.setId(loadId);
                loadrepo.save(load);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteLoad(Long loadId) {
        try {
        loadrepo.deleteById(loadId);
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
}