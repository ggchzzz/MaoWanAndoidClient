package mao.com.mao_wanandroid_client.model.tree;

import java.io.Serializable;
import java.util.List;

/**
 * @author maoqitian
 * @Description 知识体系数据
 * @Time 2018/9/6 0006 23:28
 */
public class KnowledgeHierarchyData implements Serializable {

    /**
     * children : []
     * courseId : 13
     * id : 60
     * name : Android Studio相关
     * order : 1000
     * parentChapterId : 150
     * visible : 1
     */

    private int courseId;
    private int id;
    private String name;
    private int order;
    private int parentChapterId;
    private int visible;
    private List<KnowledgeHierarchyData> children;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getParentChapterId() {
        return parentChapterId;
    }

    public void setParentChapterId(int parentChapterId) {
        this.parentChapterId = parentChapterId;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public List<KnowledgeHierarchyData> getChildren() {
        return children;
    }

    public void setChildren(List<KnowledgeHierarchyData> children) {
        this.children = children;
    }
}