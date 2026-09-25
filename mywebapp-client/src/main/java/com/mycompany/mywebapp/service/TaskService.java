package com.mycompany.mywebapp.service;

import com.mycompany.mywebapp.model.Priority;
import com.mycompany.mywebapp.model.Status;
import com.mycompany.mywebapp.model.Task;
import java.util.ArrayList;
import java.util.List;

/** Fonte única de dados do TaskFlow (sem backend nesta versão). */
public class TaskService {

    private static final TaskService INSTANCE = new TaskService();

    public static TaskService get() { return INSTANCE; }

    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    private TaskService() {
        save(new Task(0, "Configurar ambiente GWT", "Setup", Priority.ALTA, Status.CONCLUIDA));
        save(new Task(0, "Criar o MainLayout", "Interface", Priority.ALTA, Status.CONCLUIDA));
        save(new Task(0, "Implementar navegação", "Interface", Priority.MEDIA, Status.EM_ANDAMENTO));
        save(new Task(0, "Escrever o formulário", "Interface", Priority.MEDIA, Status.PENDENTE));
        save(new Task(0, "Revisar responsividade", "Qualidade", Priority.BAIXA, Status.PENDENTE));
    }

    /** Quem quiser ser avisado quando as tarefas mudarem. */
    public interface Listener {
        void onTasksChanged();
    }

    private final List<Listener> listeners = new ArrayList<>();

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    private void fireChanged() {
        for (Listener l : listeners) {
            l.onTasksChanged();
        }
    }

    public List<Task> findAll() {
        return new ArrayList<>(tasks);
    }

    public Task findById(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) return t;
        }
        return null;
    }

    /** Cria quando id == 0, atualiza quando já existe. */
    public Task save(Task task) {
        if (task.getId() == 0) {
            task.setId(nextId++);
            tasks.add(task);
        } else {
            Task current = findById(task.getId());
            if (current != null) {
                int index = tasks.indexOf(current);
                tasks.set(index, task);
            }
        }

        fireChanged();
        return task;
    }

    public void delete(int id) {
        Task task = findById(id);
        if (task != null) {
            tasks.remove(task);
            fireChanged();
        }
    }


    /** Filtra por texto no título e, opcionalmente, por status. */
    public List<Task> search(String term, Status status) {
        String q = term == null ? "" : term.trim().toLowerCase();
        List<Task> result = new ArrayList<>();
        for (Task t : tasks) {
            boolean matchText = q.isEmpty() || t.getTitle().toLowerCase().contains(q);
            boolean matchStatus = status == null || t.getStatus() == status;
            if (matchText && matchStatus) result.add(t);
        }
        return result;
    }

    public int countByStatus(Status status) {
        int total = 0;
        for (Task t : tasks) {
            if (t.getStatus() == status) total++;
        }
        return total;
    }

    public int count() { return tasks.size(); }
}