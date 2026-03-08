package com.coach.board_backend;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/classics")
@CrossOrigin(origins={"http://localhost:5173","http://localhost:4173","https://board-frontend-henna.vercel.app"})
public class ClassicTacticController {
    private final ClassicTacticRepository repo;
    public ClassicTacticController(ClassicTacticRepository repo) {
        this.repo = repo;
    }
    @PostMapping
    public ClassicTactic save(@RequestBody TacticDto dto) {//保存战术
        ClassicTactic t = new ClassicTactic();//创建实体对象
        t.setTitle(dto.getTitle());
        t.setFramesJson(dto.getFramesJson());
        t.setMessage(dto.getMessage());
        return repo.save(t);//保存到数据库并返回保存后的对象（包含ID）
    }
    @GetMapping("/{id}")
    public ClassicTactic get(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }
    @GetMapping //查询全部战术
    public List<ClassicTactic> listAll(){
        return repo.findAll();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }
    @PutMapping("/{id}")
    public ClassicTactic update(@PathVariable Long id,@RequestBody TacticDto dto){ //按照dto更新战术
        ClassicTactic t=repo.findById(id).orElseThrow();
        t.setTitle(dto.getTitle());
        t.setFramesJson(dto.getFramesJson());
        t.setMessage(dto.getMessage());
        return repo.save(t);
    }
}