package io.choerodon.test.manager.app.service;

import io.choerodon.test.manager.api.dto.TestCycleDTO;
import io.choerodon.agile.api.dto.ProductVersionPageDTO;
import io.choerodon.core.domain.Page;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by 842767365@qq.com on 6/11/18.
 */
public interface TestCycleService {
    TestCycleDTO insert(TestCycleDTO testCycleDTO);

    void delete(TestCycleDTO testCycleDTO);

    List<TestCycleDTO> update(List<TestCycleDTO> testCycleDTO);

	TestCycleDTO cloneCycle(Long cycleId, String cycleName);

	TestCycleDTO cloneFolder(Long cycleId, TestCycleDTO testCycleDTO);

    List<TestCycleDTO> getTestCycle(Long versionId);

	List<TestCycleDTO> filterCycleWithBar(String filter);

    ResponseEntity<Page<ProductVersionPageDTO>> getTestCycleVersion(Long projectId, Map<String, Object> searchParamMap);
}