# Changelog

这个项目的所有显著变化都将被记录在这个文件中。

## [0.8.0] - 2018-07-19

### 新增

- 增加测试管理功能模块后端
- 新增测试摘要功能
- 新增测试循环功能
- 新增测试用例管理功能
- 新增测试报表功能
- 新增测试状态管理功能
- 用户可以通过测试管理功能模块管理自己的测试用例了
- 测试用例可以和敏捷模块挂钩形成缺陷

## [0.9.0] - 2018-08-17

### 新增

#### 0.9.0显著新增特性

- 界面增加多语言,可以配合平台进行多语言切换
- 增加仪表盘展示界面
- 执行列表增加快速通过按钮，若测试通过不必点到详情调整执行状态
- 增加循环导出功能，用户可将循环的内容导出为excel
- 增加循环跨版本克隆功能，用户可将测试循环复制到其他版本中复用
- 测试循环详情表格伸缩显示，优化在树状图收起后的表格内容展示
- 增加部分单元测试
- 增加部分api测试
- 增加了创建测试用例时名称校验
- 问题编号增加转跳，用户不必切换到敏捷界面查看缺陷
- 用例详情中的执行记录中增加循环转跳，用户可在用例详情中的执行表格中直接转跳
- `用例管理`的默认搜索，不需要选择字段再进行选择了
- `循环详情`界面增加根据人员筛选功能，用户可筛选指派人或执行方
- 关联缺陷时支持转跳方便新建缺陷

### 修改

#### 0.9.0显著修改特性

- 优化了报表、测试循环、测试步骤、缺陷等查询接口
- 事件消息改为saga模式
- 测试状态图标样式变更
- `测试摘要`页面接口整合优化
- `用例管理`页面增加展示内容
- `用例管理`排序去掉多余字段
- 执行详情表格内编辑，降低操作成本
- `用例管理`中测试步骤可表格内编辑，降低操作复杂度
- 优化`报表`页面布局，列宽不会因为展开变动

### 修复

#### 0.9.0显著修复特性

- 修复`测试循环`和步骤分页显示问题
- 修复删除测试用例后的计数不会级联删除的问题
- 修复删除执行后的页面不会全局自动刷新的问题
- 修复执行详情界面宽度兼容错误导致看不到编辑按钮的问题
- 修复了`报表`的分页数据错误的问题

## [0.10.0] - 2018-09-30

### 新增

#### 0.10.0显著新增特性

- 增加了oracle数据库支持
- 增加了单元测试
- 增加了测试计划功能
- 测试用例管理添加文件夹层级

### 修改

#### 0.10.0显著修改特性

- 修改报表数据源选择操作，当前只显示拥有测试关联的数据
- 修改测试用例添加测试执行的操作
- 测试循环增加根据用户过滤

### 修复

#### 0.10.0显著修复特性

- 缺陷关联表补充 `project_id` 字段

## [0.11.0] - 2018-11-16

### 新增

#### 0.11.0显著新增特性

- 测试用例使用模板excel导入功能
- 测试用例导出功能
- 测试执行详情翻页功能

### 修改

#### 0.11.0显著修改特性

- 测试执行导出改为异步修改，增加进度条
- 配合敏捷服务修改部分接口
- 测试用例文件夹复制和移动现在可进行批量操作

### 修复

#### 0.11.0显著修复特性

- 测试计划中克隆测试阶段可以跨循环、版本