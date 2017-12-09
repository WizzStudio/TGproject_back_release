package site.tgclub.model;

import java.util.Set;

/**
 * 部门信息表
 * @author 7lenovo
 *
 */
public class Department {

		private Integer id;
		private String name;
		//部门描述
		private String description;
		//部门成员
		private Set<Member> members;

			public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Set<Member> getMembers() {
			return members;
		}

		public void setMembers(Set<Member> members) {
			this.members = members;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder("{");
			sb.append("\"id\":")
					.append(id);
			sb.append(",\"name\":\"")
					.append(name).append('\"');
			sb.append(",\"description\":\"")
					.append(description).append('\"');
			sb.append(",\"members\":")
					.append(members);
			sb.append('}');
			return sb.toString();
		}
}
