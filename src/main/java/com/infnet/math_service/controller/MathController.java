package com.infnet.math_service.controller;

import com.infnet.math_service.dto.OperationRequest;
import com.infnet.math_service.dto.OperationResponse;
import com.infnet.math_service.exception.DivideByZeroException;
import com.infnet.math_service.service.MathService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/math")
public class MathController {

    private final MathService service;

    public MathController(MathService service) {
        this.service = service;
    }

    private Double choose(Double qValue, Double bodyValue) {
        return qValue != null ? qValue : bodyValue;
    }

    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<OperationResponse> add(
            @RequestParam(required = false) Double a,
            @RequestParam(required = false) Double b,
            @RequestBody(required = false) OperationRequest body) {

        Double aa = choose(a, body != null ? body.getA() : null);
        Double bb = choose(b, body != null ? body.getB() : null);

        if (aa == null || bb == null)
            return ResponseEntity.badRequest().build();

        double result = service.add(aa, bb);
        return ResponseEntity.ok(new OperationResponse("add", aa, bb, result));
    }

    @RequestMapping(value = "/subtract", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<OperationResponse> subtract(
            @RequestParam(required = false) Double a,
            @RequestParam(required = false) Double b,
            @RequestBody(required = false) OperationRequest body) {

        Double aa = choose(a, body != null ? body.getA() : null);
        Double bb = choose(b, body != null ? body.getB() : null);

        if (aa == null || bb == null)
            return ResponseEntity.badRequest().build();

        double result = service.subtract(aa, bb);
        return ResponseEntity.ok(new OperationResponse("subtract", aa, bb, result));
    }

    @RequestMapping(value = "/multiply", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<OperationResponse> multiply(
            @RequestParam(required = false) Double a,
            @RequestParam(required = false) Double b,
            @RequestBody(required = false) OperationRequest body) {

        Double aa = choose(a, body != null ? body.getA() : null);
        Double bb = choose(b, body != null ? body.getB() : null);

        if (aa == null || bb == null)
            return ResponseEntity.badRequest().build();

        double result = service.multiply(aa, bb);
        return ResponseEntity.ok(new OperationResponse("multiply", aa, bb, result));
    }

    @RequestMapping(value = "/divide", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<OperationResponse> divide(
            @RequestParam(required = false) Double a,
            @RequestParam(required = false) Double b,
            @RequestBody(required = false) OperationRequest body) {

        Double aa = choose(a, body != null ? body.getA() : null);
        Double bb = choose(b, body != null ? body.getB() : null);

        if (aa == null || bb == null)
            return ResponseEntity.badRequest().build();

        if (bb == 0.0) throw new DivideByZeroException("Divisor must not be zero.");

        double result = service.divide(aa, bb);
        return ResponseEntity.ok(new OperationResponse("divide", aa, bb, result));
    }

    @RequestMapping(value = "/power", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<OperationResponse> power(
            @RequestParam(required = false) Double base,
            @RequestParam(required = false, name = "exp") Double exp,
            @RequestBody(required = false) OperationRequest body) {

        Double bBase = choose(base, body != null ? body.getBase() : null);
        Double bExp = choose(exp, body != null ? body.getExponent() : null);

        if (bBase == null || bExp == null)
            return ResponseEntity.badRequest().build();

        double result = service.power(bBase, bExp);
        return ResponseEntity.ok(new OperationResponse("power", bBase, bExp, result));
    }
}
