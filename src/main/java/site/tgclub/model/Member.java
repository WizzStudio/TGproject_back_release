package site.tgclub.model;
/**
 * 用户表
 * @author 7lenovo
 *
 */
public class Member {

		private Integer id;
		private String username;	//用户名
		private String college;		//学院
		private Integer departmentId;//所属部门
		private Integer projectId;//人员所做的项目
		private String avatar;
		private String introduction;
		private String tag;
		private Integer gender;
		private Integer age;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getCollege() {
			return college;
		}

		public void setCollege(String college) {
			this.college = college;
		}

		public Integer getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(Integer departmentId) {
			this.departmentId = departmentId;
		}

		public Integer getProjectId() {
			return projectId;
		}

		public void setProjectId(Integer projectId) {
			this.projectId = projectId;
		}

		public String getAvatar() {
			return avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public String getIntroduction() {
			return introduction;
		}

		public void setIntroduction(String introduction) {
			this.introduction = introduction;
		}

		public String getTag() {
			return tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public Integer getGender() {
			return gender;
		}

		public void setGender(Integer gender) {
			this.gender = gender;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder("{");
			sb.append("\"id\":")
					.append(id);
			sb.append(",\"username\":\"")
					.append(username).append('\"');
			sb.append(",\"college\":\"")
					.append(college).append('\"');
			sb.append(",\"departmentId\":")
					.append(departmentId);
			sb.append(",\"projectId\":")
					.append(projectId);
			sb.append(",\"avatar\":\"")
					.append(avatar).append('\"');
			sb.append(",\"introduction\":\"")
					.append(introduction).append('\"');
			sb.append(",\"tag\":\"")
					.append(tag).append('\"');
			sb.append(",\"gender\":")
					.append(gender);
			sb.append(",\"age\":")
					.append(age);
			sb.append('}');
			return sb.toString();
		}
}
