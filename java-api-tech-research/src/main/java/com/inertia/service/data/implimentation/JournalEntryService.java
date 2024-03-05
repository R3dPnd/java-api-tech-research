package com.inertia.service.data.implimentation;

import com.inertia.entities.JournalEntryEntity;
import com.inertia.repository.JournalEntryRepository;
import com.inertia.service.data.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalEntryService implements IDataService<JournalEntryEntity> {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    @Override
    public JournalEntryEntity get(int id) {
        return journalEntryRepository.getReferenceById(id);
    }

    @Override
    public List<JournalEntryEntity> getAll() {
        return journalEntryRepository.findAll();
    }

    @Override
    public JournalEntryEntity saveOrUpdate(JournalEntryEntity entity) {
        return journalEntryRepository.save(entity);
    }

    @Override
    public void delete(int id) {
        journalEntryRepository.deleteById(id);
    }
}
