package site.tgclub.model;

import java.util.Set;

/**
 * @author fzm
 */
public class Category {
    private Integer id;
    private String description;
    private Set<Project> projects;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"description\":\"")
                .append(description).append('\"');
        sb.append(",\"projects\":")
                .append(projects);
        sb.append('}');
        return sb.toString();
    }
}
